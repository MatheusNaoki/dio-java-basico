package SMARTTV;
public class SmartTV
{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal)
    {
        canal = novoCanal;
    }
    

    public void aumentarVolume()
    {
        //volume = volume += 1
        volume += 1;
    }
    
    public void diminuirVolume()
    {
        //volume = volume -= 1
        volume -= 1;
    }

    public void ligar()
    {
        ligada = true;
    }

    public void desligar()
    {
        ligada = false;
    }
}