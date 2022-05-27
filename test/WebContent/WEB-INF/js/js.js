function loginFunc(e){



    var username = document.getElementById('codigo').value;
    var clave = document.getElementById('password').value;


    var urllogin ="https://api-parcial.crangarita.repl.co/login";
    var data = {codigo: username, password: clave};

    
    fetch(urllogin, {
      method: 'POST', // or 'PUT'
      body: JSON.stringify(data), // data can be `string` or {object}!
      headers:{
        'Content-Type': 'application/json'
      }

  }).then(res => res.json())
    .catch(error => console.error('Error:', error))
    .then(response => console.log('Success:', response));
    //var mostrar = document.getElementById('mostrar');
}



document.getElementById("ingresar").onclick = function(){


    var username = document.getElementById('codigo').value;
    var clave = document.getElementById('password').value;


    var urllogin = "https://api-parcial.crangarita.repl.co/login";
    var data = {codigo: username, clave: clave};
    
    fetch(urllogin, {
      method: 'POST', // or 'PUT'
      body: JSON.stringify(data), // data can be `string` or {object}!
      headers:{
        'Content-Type': 'application/json'
      }

      
    }).then(res => res.json())
    .catch(error => console.error('Error:', error))
    .then(response => {
      console.log(response);
                        if(response.codigo){
                          console.log('Success:', response);
                          localStorage.setItem("codigo", response.codigo);
                          localStorage.setItem("password", response.password);
                          window.location.href="notas.html";
                        }else{
                          alert("Los datos son invalidos");
                        }
                      }
         );
  }/**
 * 
 */