
import java.awt.*;

import static java.lang.Math.sqrt;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private Float vitezaCurenta;
    private int treaptaVC=0;
    private int nrTrepte;

    private float kmParcursi=0f;

    static final Float Viteza_Max=250f; //-constanta

    private Sofer sofer;
    private Rezervor rezervor;

   Autovehicul(String marcaCurenta,Color culoareC,Float vC,int nrT)
     {
         this.marca=marcaCurenta;
         this.culoare=culoareC;
         this.vitezaCurenta=vC;
         this.nrTrepte=nrT;
     }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public Float getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(Float vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public int getTreaptaVC() {
        return treaptaVC;
    }

    public void setTreaptaVC(int treaptaVC) {
        this.treaptaVC = treaptaVC;
    }

    public int getNrTrepte() {
        return nrTrepte;
    }

    public void setNrTrepte(int nrTrepte) {
        this.nrTrepte = nrTrepte;
    }

    public float getKmParcursi() {
        return kmParcursi;
    }

    public void setKmParcursi(float kmParcursi) {
        this.kmParcursi = kmParcursi;
    }

    public String getStatus()
    {
        return "marca: "+ marca +" culoare: "+culoare + " treapta viteaza curenta: " + treaptaVC + " viteza curenta: " + vitezaCurenta;  // TODO
    }

   /* private String toString(Color culoare) {
          return  toString(culoare);
    }*/

    public boolean schimbaTreapta(int x)
    {
        if(x>=0 && x<=nrTrepte)
        {
            treaptaVC=x;
            return true;
        }
        else
            return false;
    }

    public double accelerare(float acc, float t1, float t2)
    {
        float deltax=  (acc*(t1-t2)*(t1-t2))/2;
        float v=(2*acc*deltax);
        return sqrt(v);
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public Rezervor getRezervor() {
        return rezervor;
    }

    public void setRezervor(Rezervor rezervor) {
        this.rezervor = rezervor;
    }
}
