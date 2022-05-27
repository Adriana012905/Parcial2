package co.empresa.test.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import co.empresa.test.modelo.Usuario;
import co.empresa.test.util.ConexionMySQL;
import co.empresa.test.util.ConexionPostgreSQL;

public class UsuarioDaoPostgreSQL implements UsuarioDao {
	
	private ConexionPostgreSQL conexion;
	
	private static final String INSERT_USUARIO_SQL = "INSERT INTO usuario (nombre, email, pais) VALUES (?, ?, ?);";
	private static final String DELETE_USUARIO_SQL = "DELETE FROM usuario WHERE id = ?;";
	private static final String UPDATE_USUARIO_SQL = "UPDATE usuario SET nombre = ?, email = ?, pais = ? WHERE id = ?;";
	private static final String SELECT_USUARIO_BY_ID = "SELECT * FROM usuario WHERE id = ?;";
	private static final String SELECT_ALL_USUARIOS = "SELECT * FROM usuario;";
	
	
	
	public UsuarioDaoPostgreSQL() {
		this.conexion = ConexionPostgreSQL.getConexion();
	}

	public void insert(Usuario usuario) throws SQLException {
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(INSERT_USUARIO_SQL);
			preparedStatement.setString(1, usuario.getUsername());
			preparedStatement.setString(2, usuario.getPassword());
			preparedStatement.setString(3, usuario.getEmail());
			conexion.execute();
		} catch (SQLException e) {
			
		}
	}
	
	public void delete (int id)  throws SQLException {
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(DELETE_USUARIO_SQL);
			preparedStatement.setInt(1, id);

			conexion.execute();
		} catch (SQLException e) {
			
		}
	}
	
	public void update(Usuario usuario)  throws SQLException {
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(UPDATE_USUARIO_SQL);
			preparedStatement.setInt(1, usuario.getId());
			preparedStatement.setString(2, usuario.getUsername());
			preparedStatement.setString(3, usuario.getPassword());
			preparedStatement.setInt(4, usuario.getId());
			conexion.execute();
		} catch (SQLException e) {
			
		}
	}
	
	public List<Usuario> selectAll() {
		List <Usuario> usuarios = new ArrayList<>();
		
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(SELECT_ALL_USUARIOS);
			
			ResultSet rs = conexion.query();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String email = rs.getString("email");
				usuarios.add(new Usuario(id, username, password, email));
			}
			
		} catch (SQLException e) {
			
		}
		
		return usuarios;
		
	}
	
	
	public Usuario select(int id) {
		Usuario usuario = null;
		
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(SELECT_USUARIO_BY_ID);
			preparedStatement.setInt(1, id);
			
			ResultSet rs = conexion.query();
			
			while(rs.next()) {
				String nombre = rs.getString("username");
				String password = rs.getString("password");
				String email = rs.getString("email");
				usuario = new Usuario(id,nombre,password, email);
			}
			
		} catch (SQLException e) {
			
		}
		
		return usuario;
		
	}

}
