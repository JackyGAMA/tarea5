public class Cafetera {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Cafetera(){
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }
    public  Cafetera(int agua, int cafe, int crema, int vasos){
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }
    public int getAgua(){
        return agua;
    }
    public void setAgua(int agua ){
        this.agua = agua;
    }
    public int getCafe(){
        return cafe;
    }
    public void setCafe(int cafe ){
        this.cafe = cafe;
    }

    public int getCrema(){
        return crema;
    }
    public void setCrema(int crema ){
        this.crema = crema;
    }
    public int getVasos(){
        return vasos;
    }
    public void setVasos(int vasos ){
        this.vasos = vasos;
    }
    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void servirCafe(String tipo){
        if(vasos == 0){
            System.out.println("No hay más vasos disponibles");
            return;
        }
        switch (tipo){
            case "Americano":
                if(agua >= 180 && cafe >= 15){
                    agua -= 180;
                    cafe -= 15;
                    vasos--;
                    System.out.println("Se ha servido un café Americano...");
                }else{
                    System.out.println("Ya no hay café Americano...");
                }
                break;
            case "Expreso":
                if(agua >= 120 && cafe >= 20){
                    agua -= 120;
                    cafe -= 20;
                    vasos--;
                    System.out.println("Se ha servido un café Expreso...");
                }else{
                    System.out.println("Ya no hay café Expreso...");
                }
                break;
            case "Capuchino":
                if(agua >= 100 && crema >= 70 && cafe >= 14){
                    agua -= 100;
                    crema -= 70;
                    cafe -= 14;
                    vasos--;
                    System.out.println("Se ha servido un Capuchino...");
                }else{
                    System.out.println("Ya no hay Capuchino...");
                }
                break;
            default:
                System.out.println("Tipo de café no válido");
        }
    }
    public void mostrarRecursos(){
        System.out.println("Agua: " + agua + "ml");
        System.out.println("Café: " + cafe + "g");
        System.out.println("Crema: " + crema + "ml");
        System.out.println("Vasos: " + vasos);
    }
}

