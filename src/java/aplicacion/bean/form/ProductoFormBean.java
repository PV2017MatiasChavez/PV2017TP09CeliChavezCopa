/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.datos.ColeccionProductos;
import aplicacion.modelo.dominio.Producto;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Matías
 */
@ManagedBean
@ViewScoped
public class ProductoFormBean {
    private Producto producto;
    private double preciototalxd = 0;
    private ColeccionProductos lproductos;
    private String unNombre;
    private String unCodigo;
    private double unPrecio;
    private String unaCuota;
    private ArrayList<String> cuotas;
    private double pCuota;

    /**
     * Creates a new instance of ProductoFormBean
     */
    public ProductoFormBean() {
        lproductos=new ColeccionProductos();
        cuotas=new ArrayList();
        cuotas.add("1");
        cuotas.add("3");
        cuotas.add("6");
        cuotas.add("12");

    }
   
    public double productoTotal()
    {
        return lproductos.productoTotal();
    }
    
    public void agregarProducto(){
        setProducto(new Producto(getUnNombre(), getUnCodigo(), getUnPrecio(), getUnaCuota(),pCuota));
        getLproductos().agregarProducto(getProducto());
        
    }
        
    public double penc(){
        pCuota= (Math.pow(1+0.015, 3)*3) * unPrecio;
        return pCuota;
    }
    
    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the lproductos
     */
    public ColeccionProductos getLproductos() {
        return lproductos;
    }

    /**
     * @param lproductos the lproductos to set
     */
    public void setLproductos(ColeccionProductos lproductos) {
        this.lproductos = lproductos;
    }

    /**
     * @return the unNombre
     */
    public String getUnNombre() {
        return unNombre;
    }

    /**
     * @param unNombre the unNombre to set
     */
    public void setUnNombre(String unNombre) {
        this.unNombre = unNombre;
    }

    /**
     * @return the unCodigo
     */
    public String getUnCodigo() {
        return unCodigo;
    }

    /**
     * @param unCodigo the unCodigo to set
     */
    public void setUnCodigo(String unCodigo) {
        this.unCodigo = unCodigo;
    }

    /**
     * @return the unPrecio
     */
    public double getUnPrecio() {
        return unPrecio;
    }

    /**
     * @param unPrecio the unPrecio to set
     */
    public void setUnPrecio(double unPrecio) {
        this.unPrecio = unPrecio;
    }

    /**
     * @return the unaCuota
     */
    public String getUnaCuota() {
        return unaCuota;
    }

    /**
     * @param unaCuota the unaCuota to set
     */
    public void setUnaCuota(String unaCuota) {
        this.unaCuota = unaCuota;
    }

    /**
     * @return the cuotas
     */
    public ArrayList<String> getCuotas() {
        return cuotas;
    }

    /**
     * @param cuotas the cuotas to set
     */
    public void setCuotas(ArrayList<String> cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * @return the pCuota
     */
    public double getpCuota() {
        return pCuota;
    }

    /**
     * @param pCuota the pCuota to set
     */
    public void setpCuota(double pCuota) {
        this.pCuota = pCuota;
    }

    /**
     * @return the preciototalxd
     */
    public double getPreciototalxd() {
        return preciototalxd;
    }

    /**
     * @param preciototalxd the preciototalxd to set
     */
    public void setPreciototalxd(double preciototalxd) {
        this.preciototalxd = preciototalxd;
    }
    
}
