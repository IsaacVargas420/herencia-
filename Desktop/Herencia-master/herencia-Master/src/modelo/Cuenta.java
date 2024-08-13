/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC19
 */
public class Cuenta {
    private double saldo;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private double tasaAnual;
    private double comisionMensual;

    public Cuenta() {
    }

    public Cuenta(double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, double comisionMensual) {
        this.saldo = saldo;
        this.numeroConsignaciones = numeroConsignaciones;
        this.numeroRetiros = numeroRetiros;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = comisionMensual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    
    public void imprimir(){
        System.out.println("""
                           DATOS CUENTA BANCARIA
                           Saldo:"""+getSaldo()+"\n"+
                "Número de Depositos:"+getNumeroConsignaciones()+"\n"+
                "Número de Retiros:"+getNumeroRetiros()+"\n"+
                "Tasa Anual Interes:"+getTasaAnual()+"\n"+
                "Comisión Banco:"+getComisionMensual());
    
    }
    public void deposito(double valorDepositar){
        setSaldo(getSaldo()+valorDepositar);
        setNumeroConsignaciones(getNumeroConsignaciones()+1);
    }
    public void retiro(double valorRetirar){
        if(valorRetirar>getSaldo()){
            System.out.println("No cuenta con los fondos suficientes"
                    + " para realizar el retiro");
        }else{ 
            System.out.println("Su saldo era:"+getSaldo());
            setSaldo(getSaldo()-valorRetirar);
            setNumeroRetiros(getNumeroRetiros()+1);
            System.out.println("Después del retiro su saldo es:"+getSaldo());
        }
    
    }
    
    public double calculoInteres(){
        double valorRendimiento=0.00;
        valorRendimiento=(getSaldo()*((getTasaAnual()/100)/12));
        //setSaldo(valorRendimiento+getSaldo());
        return valorRendimiento;
        
    }
    
    public void extractoMensual(){
        double interes=this.calculoInteres();
        setSaldo(getSaldo() -getComisionMensual()+interes);
        System.out.println("""
                           ------------Estado de Cuenta-------------
                           Saldo Actual:"""+getSaldo()+"\n"+
                "Comisión Mensual:"+getComisionMensual()+"\n"+
                "Interes Ganado en el Mes:"+interes);
        //los métodos de retorno almacenan su valor en memoria ram
        //al usar el puntero this estoy haciendo referencia al resultdo
        //previamente almacenado.
//        setSaldo(getSaldo() -getComisionMensual()+this.calculoInteres());
        
    }
}
