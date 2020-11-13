package org.lwj.bath.service;


import org.lwj.bath.entity.Artificer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lwj
 * @since 2020-11-06
 */
public interface ArtificerService  {

    List<Artificer> list();

    Artificer getById(Long id);
}
