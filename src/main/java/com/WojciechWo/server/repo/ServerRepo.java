package com.WojciechWo.server.repo;

import com.WojciechWo.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server fineByIpAddress(String ipAddress);
}
