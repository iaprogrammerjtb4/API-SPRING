class goToBack{
    
    constructor(){
        this.urlApi = 'http://localhost:3001/';            
        this.arrConentDom = [];
    }


    //function load tipo servicios
    loadTipoServicio(){        
        this.urlApi+='tipo_servicio/';                
        console.log('GET '+this.urlApi);
        fetch(this.urlApi, {
            //body: formData                        
          })          
          .then((response)=> response.json())
          .then(data=> {  
              console.log(data);                
                $('#tipo_servicio').append('<option value=""></option>');
                $.each(data,function(i,element){            
                    $('#tipo_servicio').append('<option value="'+element.id+'">'+element.nombre+'</option>');
                });
          });        
    }


    //function load disponibilidades
    loadDisponibilidades(){
        this.urlApi='http://localhost:3001/disponibilidad/';        
        console.log('GET '+this.urlApi);
        fetch(this.urlApi, {
            //body: formData                        
          })          
          .then((response)=> response.json())
          .then(data=> {  
              console.log(data);                
                $('#Disponibilidad').append('<option value=""></option>');
                $.each(data,function(i,element){            
                    $('#Disponibilidad').append('<option value="'+element.id+'">'+element.dias_semana+' '+element.cant_horas+'</option>');
                });
          });        
    }              


    //function insert client
    insertNewClient(){
        let formData =  {};                   
        formData.tipo_servicio_id = $('#tipo_servicio').val();
        formData.identificacion = $('#identificacion').val(); 
        formData.nombre = $('#nombre').val();            
        formData.telefono = $('#telefono').val();        
        formData.ciudad = $('#ciudad').val();            
        formData.direccion = $('#address').val();                              
        formData.disponibilidad_id = $('#Disponibilidad').val();         
        let varJson = JSON.stringify(formData);
        console.log(varJson);
        this.urlApi='http://localhost:3001/usuario';        
        console.log('POST'+this.urlApi);
        fetch(this.urlApi, {            
            method: 'POST',       
            headers: {                              
            'Content-Type' : 'application/json'  
            },              
            body: varJson,          
          })          
          .then((response)=> response.json())
          .then(data=> {  
              console.log(data);                                
          });        
     }        
}


(function($) {  	
	//load body content form
    const objGotoBack = new goToBack();
	objGotoBack.loadTipoServicio();        
    objGotoBack.loadDisponibilidades();

    //send new data for client
    $('#sendClient').click(function(){
        objGotoBack.insertNewClient();
    });
})(jQuery); // End of use strict