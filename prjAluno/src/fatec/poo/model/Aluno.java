/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author WLLR9505
 */
public class Aluno {
    private int ra;
    private double ntPrv1;
    private double ntPrv2;
    private double ntTrab1;
    private double ntTrab2;
    
    public int getRa() {
        return ra;
    }

    public double getNtPrv1() {
        return ntPrv1;
    }

    public double getNtPrv2() {
        return ntPrv2;
    }

    public double getNtTrab1() {
        return ntTrab1;
    }

    public double getNtTrab2() {
        return ntTrab2;
    }
    
    public void setRa(int RA) {
        ra = RA;
    }

    public void setNtPrv1(double NTPRV1) {
        ntPrv1 = NTPRV1;
    }

    public void setNtPrv2(double NTPRV2) {
        ntPrv2 = NTPRV2;
    }

    public void setNtTrab1(double NTTRAB1) {
        ntTrab1 = NTTRAB1;
    }

    public void setNtTrab2(double NTTRAB2) {
        ntTrab2 = NTTRAB2;
    }
    
    public double calcMediaProva() {
        return 0.7 * (this.ntPrv1 + 2 * this.ntPrv2) / 3;
    }
    
    public double calcMediaTrab() {
        return 0.3 * (this.ntTrab1 + this.ntTrab2) / 2;
    }
    
    public double calcMediaFinal() {
        return this.calcMediaProva() + this.calcMediaTrab();
    }
    
    public boolean isAprovado() {
        return this.calcMediaFinal() >= 6;
    }
}
