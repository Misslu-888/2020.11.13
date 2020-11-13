package org.lwj.bath.service.impl;

import org.lwj.bath.client.ArtificerClient;
import org.lwj.bath.entity.Artificer;
import org.lwj.bath.service.ArtificerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lwj
 * @since 2020-11-06
 */
@Service
public class ArtificerServiceImpl implements ArtificerService {

    @Autowired
    private ArtificerClient artificerClient;
    @Override
    public List<Artificer> list() {
       return artificerClient.list();
    }

    @Override
    public Artificer getById(Long id) {
        return artificerClient.getById(id);
    }
}
