package com.example.workshopmongo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.naming.directory.InitialDirContext;
import javax.naming.directory.Attributes;
import java.util.Hashtable;

@Component
public class MongoDnsTest implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String host =
                "_mongodb._tcp.mongodb.giovanni-mongodb-db--nm7jww6gk4nf.addon.code.run";

        Hashtable<String, String> env = new Hashtable<>();
        env.put(
                "java.naming.factory.initial",
                "com.sun.jndi.dns.DnsContextFactory"
        );
        env.put("com.sun.jndi.dns.timeout.initial", "3000");
        env.put("com.sun.jndi.dns.timeout.retries", "1");

        try {
            InitialDirContext context = new InitialDirContext(env);
            Attributes attributes = context.getAttributes(
                    host,
                    new String[]{"SRV"}
            );

            System.out.println("DNS SRV no container: " + attributes);
            context.close();
        } catch (Exception e) {
            System.err.println(
                    "Falha na consulta SRV dentro do container: " + e
            );
        }
    }
}