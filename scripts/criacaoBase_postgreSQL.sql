/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  emmanuel
 * Created: Nov 2, 2021
 */

-- Table: public.agendamentoemail

-- DROP TABLE public.agendamentoemail;

CREATE TABLE public.agendamentoemail
(
  id integer NOT NULL,
  email character varying(50) NOT NULL,
  assunto character varying(50) NOT NULL,
  mensagem character varying(255) NOT NULL,
  agendado boolean,
  CONSTRAINT agendamentoemail_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.agendamentoemail
  OWNER TO emmanuel;


