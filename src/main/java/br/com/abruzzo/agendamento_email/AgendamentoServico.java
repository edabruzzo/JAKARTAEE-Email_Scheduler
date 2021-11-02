/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.com.abruzzo.agendamento_email;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author emmanuel
 */
@Stateless
public class AgendamentoServico {

    
   List<String> listaEmails;    
   
   public AgendamentoServico() {
      listaEmails = new ArrayList<String>();
   }
    
   
   public void add(String email){
      this.listaEmails.add(email);
   }
    
    public List<String> listar(){
        
        return this.listaEmails;
    }
    
    
    
}
