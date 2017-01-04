package cn.yunyichina.log.service.frontEnd.repository;

import cn.yunyichina.log.component.entity.po.Group;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/4 11:19
 * @Description:
 */
public interface GroupRepository extends JpaRepository<Group, Integer> {
}