package guia2video.pkgsuper;

/**
 * @author Nicolas Kaminski
 */
public class Producto implements Comparable<Producto> {

    private int codigo, stock;
    private String descripcion;
    private double precio;
    private Categoria rubro;

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.stock = stock;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto x) {
        if (codigo == x.codigo) {
            return 0;
        } else if (codigo > x.codigo) {
            return 1;
        } else {
            return -1;
        }

    }

}  // LLAVE DE CLASE
