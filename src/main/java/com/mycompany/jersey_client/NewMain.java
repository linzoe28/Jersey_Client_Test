package com.mycompany.jersey_client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;
import javax.ws.rs.client.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Client client= ClientBuilder.newClient();
        WebTarget target=client.
                target("http://localhost:8080/mavenproject1/webapi/hello1")
                .queryParam("name", "WOW")
                .queryParam("helloString", "go home");
        Invocation.Builder builder=target.request(MediaType.TEXT_PLAIN); //要跟target取得的檔案設定一致
        Response response=builder.get();
        String str=response.readEntity(String.class); //設定結果型態，要與MediaType型態一致
        System.out.println(str);*/

 /*解JSON回傳結果
        Client client = ClientBuilder.newClient();
        WebTarget target = client.
                target("http://localhost:8080/mavenproject1/webapi/person").path("lendle");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON); //要跟target取得的檔案設定一致
        Response response = builder.get();
        Person person = response.readEntity(Person.class); //設定結果型態，要與MediaType型態一致
        System.out.println(person.getName()+":"+person.getEmails()[0]);*/
 /* 解List回傳結果   
        Client client = ClientBuilder.newClient();
        WebTarget target = client.
                target("http://localhost:8080/mavenproject1/webapi/persons");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON); //要跟target取得的檔案設定一致
        Response response = builder.get();
        List persons = response.readEntity(List.class); //設定結果型態，要與MediaType型態一致
        for(int i=0;i<persons.size(); i++){
            Map map=(Map) persons.get(i);
            String name=(String) map.get("name");
            System.out.println(name);
        }*/
        //POST
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/mavenproject1/webapi/person");
        Invocation.Builder builder = target.request();
        Person p = new Person();
        p.setName("PP");
        p.setEmails(new String[]{"123", "456"});
        Entity entity = Entity.entity(p, MediaType.APPLICATION_JSON);
        builder.post(entity);

    }

}
