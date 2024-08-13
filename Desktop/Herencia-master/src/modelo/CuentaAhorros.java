/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class CuentaAhorros extends Cuenta {

    private boolean estado;

    public CuentaAhorros(boolean estado, double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, double comisionMensual) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual);
        this.estado = estado;
        this.definirEstado();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void definirEstado() {
        if (getSaldo() > 10000) {
            setEstado(true);
            System.out.println("Su cuenta de ahorros se encuentra ACTIVA");
        } else {
            setEstado(false);
            System.out.println("Su cuenta de ahorros no posee el saldo suficiente para estar ACTIVA");
        }
    }

    //Consignar: se puede consignar dinero si la cuenta está activa.
    //Debe invocar al método heredado.
    public void depositar(double valorDeposito) {
        //if(isEstado()==true) if(!isEstado())?esfalso
        if (isEstado()) {
            this.deposito(valorDeposito);
            //super.deposito(valorDeposito);
        } else {
            System.out.println("No es posible depositar en cuentas inactivas");
        }
    }

    //Retirar: es posible retirar dinero si la cuenta está activa.
    //Debe invocar al método heredado.
    public void retirar(double valorDeposito) {
        //if(isEstado()==true) if(!isEstado())?esfalso
        if (isEstado()) {
            super.retiro(valorDeposito);
        } else {
            System.out.println("No es posible retirar de una cuenta inactiva");
        }
    }

//    Extracto mensual: si el número de retiros es mayor que 4, por cada 
//            retiro adicional, se cobra $1000 como comisión mensual. 
//                    Al generar el extracto, 
//            se determina si la cuenta está activa o no con el saldo.
    public void calcularExtractoMensual() {
        if (getNumeroRetiros() > 4) {
            double npago = (getNumeroRetiros() - 4) * 1000;
            setComisionMensual(npago);
            super.extractoMensual();
            this.definirEstado();
        } else {
            this.extractoMensual();
            this.definirEstado();
        }

    }
    public void imprimir(){
        String mensaje="";
        if(isEstado()){
            mensaje="Activa";
        }else{
            mensaje="Inactiva";
        }
        System.out.println("DATOS CUENTA DE AHORROS\n"+
                "Estado de la Cuenta:"+mensaje+"\n"+
                "Saldo:"+getSaldo()+"\n"+
                "Número de Depositos:"+getNumeroConsignaciones()+"\n"+
                "Número de Retiros:"+getNumeroRetiros()+"\n"+
                "Tasa Anual Interes:"+getTasaAnual()+"\n"+
                "Comisión Banco:"+getComisionMensual());
    
    }
}
