package FigurasGeometricas;

public class Rectangulo {
    private float base;
    private float altura;
    
    public Rectangulo (float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void calcularArea() {
        float area=0;
        area=base*altura;
        System.out.println("LA BASE DEL RECTÁNGULO ES: "+ base +" SU ALTURA ES: "+ altura+" Y SU ÁREA ES: "+ area);
    
     }
    
}