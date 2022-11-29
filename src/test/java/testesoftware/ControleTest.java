package testesoftware;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ControleTest 
{


    // aqui irei testar o metodo de mudar canal, para garantir que as entradas de usuario receba a mensagem correta.
    //considerando que todos os canais entre 0 e 999 irao mudar o canal, e outro valor maior ou menor ira exibir erro.
    @Test
    public void checaLimiteCanais()
    {
        Controle ctrl = new Controle(0,0,true);
        for(int x=0;x<999;x++){
            assertEquals("Mudando canal para " + x, ctrl.mudarCanal(String.valueOf(x)));
        }
        assertEquals("valor incorreto " , ctrl.mudarCanal(String.valueOf(-1)));
        assertEquals("valor incorreto " , ctrl.mudarCanal(String.valueOf(1000)));
    }



    // este teste ira testar se os valores de volume estao entre 0 e 10 durante a chamada do metodo aumentar e diminuir volume
    @Test
    public void checaVolume()
    {
        //texta volume minimo
        Controle ctrl = new Controle(0,0,true);
        for(int x=ctrl.getVolume();x>0;x--){
            assertEquals("volume agora é " + x, ctrl.diminuirVolume());
        }
        assertEquals("volume esta no minimo" , ctrl.diminuirVolume());
       
        //testa valume maximo
       
        for(int x=ctrl.getVolume();x<10;x++){
            int y = x+1;
            assertEquals("volume agora é " + y, ctrl.aumentarVolume());
        }
        assertEquals("volume esta no maximo" , ctrl.aumentarVolume());
    }


    // este teste ira garantir que os metodos da classe nao irao funcional caso a tv esteja desligada
    // e tambem vao testar o botao liga e desliga
    @Test
    public void checaEstado()
    {
        //testa funçoes durante desligado
        Controle ctrl = new Controle(0,0,false);        
        assertEquals("tv desligada" , ctrl.mudarCanal(String.valueOf(3)));
        assertEquals("tv desligada" , ctrl.diminuirVolume());
        assertEquals("tv desligada" , ctrl.aumentarVolume());

        //testa botao liga e desliga
        assertTrue(!ctrl.getEstado());
        ctrl.ligaDesliga();
        assertTrue(ctrl.getEstado());
    }
}
