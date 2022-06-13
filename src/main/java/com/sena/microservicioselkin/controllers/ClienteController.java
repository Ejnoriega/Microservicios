package com.sena.microservicioselkin.controllers;

import com.sena.microservicioselkin.models.Cliente;
import com.sena.microservicioselkin.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/cliente")
    public class ClienteController {

        @Autowired
        private ClienteRepository interfaceCliente;

        @GetMapping("/buscarTodos")
        public List<Cliente> Cliente() {
            return interfaceCliente.findAll();
        }

        @GetMapping("{id_cliente}")
        public Cliente findById(@PathVariable("id_cliente") Integer id_cliente) {
            return interfaceCliente.findById(id_cliente).get();
        }

        @PostMapping("/guardar")
        public void insertar(@RequestBody Cliente stu) {
            interfaceCliente.save(stu);
        }

        @PutMapping
        public void modificar(@RequestBody Cliente stu) {
            interfaceCliente.save(stu);
        }

        @DeleteMapping("{id_cliente}")
        public String deleteById(@PathVariable("id_cliente") Integer id_cliente) {
            try {
                interfaceCliente.deleteById(id_cliente);
            } catch (Exception e) {
                return "Error";
            }
            return "Listo";
        }
    }

