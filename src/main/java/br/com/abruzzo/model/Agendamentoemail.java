/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abruzzo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author emmanuel
 */
@Entity
@Table(name = "agendamentoemail")
@NamedQueries({
    @NamedQuery(name = "Agendamentoemail.findAll", query = "SELECT a FROM Agendamentoemail a"),
    @NamedQuery(name = "Agendamentoemail.findById", query = "SELECT a FROM Agendamentoemail a WHERE a.id = :id"),
    @NamedQuery(name = "Agendamentoemail.findByEmail", query = "SELECT a FROM Agendamentoemail a WHERE a.email = :email"),
    @NamedQuery(name = "Agendamentoemail.findByAssunto", query = "SELECT a FROM Agendamentoemail a WHERE a.assunto = :assunto"),
    @NamedQuery(name = "Agendamentoemail.findByMensagem", query = "SELECT a FROM Agendamentoemail a WHERE a.mensagem = :mensagem"),
    @NamedQuery(name = "Agendamentoemail.findByAgendado", query = "SELECT a FROM Agendamentoemail a WHERE a.agendado = :agendado")})
public class Agendamentoemail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "assunto")
    private String assunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "mensagem")
    private String mensagem;
    @Column(name = "agendado")
    private Boolean agendado;

    public Agendamentoemail() {
    }

    public Agendamentoemail(Integer id) {
        this.id = id;
    }

    public Agendamentoemail(Integer id, String email, String assunto, String mensagem) {
        this.id = id;
        this.email = email;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getAgendado() {
        return agendado;
    }

    public void setAgendado(Boolean agendado) {
        this.agendado = agendado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agendamentoemail)) {
            return false;
        }
        Agendamentoemail other = (Agendamentoemail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.abruzzo.model.Agendamentoemail[ id=" + id + " ]";
    }
    
}
