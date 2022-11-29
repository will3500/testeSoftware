package testesoftware;

public class Controle {
    private int canal =0;
    private int volume = 10;
    private boolean ligado = true;



    public Controle(int ch, int vol, boolean estado){
        this.canal=ch;
        this.volume=vol;
        this.ligado= estado;
    }

    public String aumentarVolume(){
        if(ligado){
            if(volume<10){
                this.volume++;
                return "volume agora é " + this.volume;
            }
            else{
                return "volume esta no maximo" ;
            }
        }
        return "tv desligada";
    }

    public String diminuirVolume(){
        if(ligado){
            if(volume>0){
                this.volume--;
                return "volume agora é " + this.volume;
            }
            else{
                return "volume esta no minimo" ;
            }
        }
        return "tv desligada";
    }

    public String mudarCanal(String x){
        
        try {
            int y =Integer.parseInt(x);
            if(ligado){
                if(y>=0 && y<=999){
                    this.canal=y;
                    return "Mudando canal para " + this.canal ;
                }
                return "valor incorreto " ;
            }
            return "tv desligada";
        } catch (Exception e) {
            return "Erro";
        }

       
    }

    public String ligaDesliga(){
        this.ligado= !this.ligado;
        return "Executado" ;
    }

    public int getVolume(){
        return this.volume;
    }

    public boolean getEstado(){
        return this.ligado;
    }
}
