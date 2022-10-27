/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.de.estructuras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author MARCOS ANDRES
 */
public class BaseDatosProductos {
    private HashMap<Integer, producto>listaProducto= new HashMap<>();
    
   

    public BaseDatosProductos() {
        this.listaProducto.put(1, new producto(1, "Manzanas", 8000, 65));
        this.listaProducto.put(2, new producto(2, "Manzanas", 8000, 65));
        this.listaProducto.put(3, new producto(3, "Manzanas", 8000, 65));
        this.listaProducto.put(4, new producto(4, "Manzanas", 8000, 65));
        this.listaProducto.put(5, new producto(5, "Manzanas", 8000, 65));
        this.listaProducto.put(6, new producto(6, "Manzanas", 8000, 65));
        this.listaProducto.put(7, new producto(7, "Manzanas", 8000, 65));
        this.listaProducto.put(8, new producto(8, "Manzanas", 8000, 65));
        this.listaProducto.put(9, new producto(9, "Manzanas", 8000, 65));
        this.listaProducto.put(10, new producto(10, "Manzanas", 8000, 65));
    }
    public List<producto>getlistaProducto(){
    return new ArrayList<>(this.listaProducto.values());
    }
    
    public void setlistaProducto(HashMap<Integer, producto>listaproducto){
         this.listaProducto= listaproducto;
}
public boolean VerificarExistencias(producto producto){
        return this.listaProducto.containsKey(producto);
}
public boolean VerificarExistencias(String nombre){
    for(producto p : this.listaProducto.values()){
        if(nombre.toLowerCase().equals(p.getNombre().toLowerCase())){
        return true;
        }

    }
      return false;
}

public int ultimoCodigo(){
       int codigo =0;
       for(producto p : this.listaProducto.values()){
        codigo = p.getCodigo();
}
       return codigo;
}
public void agregar(producto p){
this.listaProducto.put(p.getCodigo(), p);
        }
public void actualizar(producto p){
this.listaProducto.replace(p.getCodigo(), p);
}
public void borrar (producto p){
 this.listaProducto.remove(p.getCodigo());}
public String generarInforme(){
    List<producto>listaMayores = obtenerMayores();
    return listaMayores.get(0).getNombre()+" "+listaMayores.get(1).getNombre()+" "+listaMayores.get(2).getNombre();}
private List<producto>obtenerMayores(){
List<producto>lista = new ArrayList<>(this.listaProducto.values());
List<producto>listaM = new ArrayList<>();

for(int i =0; i<3; i++){
    producto p = new producto();
    for(producto pTemp : listaM){
    if(pTemp.getPrecio()>p.getPrecio()){
    p=pTemp;
    }
    }
    listaM.add(p);
    lista.remove(p);
}
return listaM;
}
}
   


