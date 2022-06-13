package com.sena.microservicioselkin.repository;

import com.sena.microservicioselkin.models.Cliente;


public interface ClienteService {

    Cliente saveCliente(Cliente cliente);

    Cliente getClienteById(Integer id_cliente);

    Cliente updateCliente(Cliente cliente);

    void deleteclienteById(Integer id_cliente);
}
