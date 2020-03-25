package demo.domain;

/**
 * ClassName: UserDO
 * Package: demo.dao
 * Date: 2020/3/25 10:36
 * Author; 吴华川
 */

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户实体类
 */
@Data
@Entity //标明实体类
@Table(name = "t_user") //指定表名,如果没有指定，则表名和实体的名称保持一致。
public class UserDO {
    @Id  //标明主键
    private Integer id;
    @Column(name = "user_name", length = 200) //非主键列
    private String userName;
    @Column(name = "password", length = 200)
    private String password;
    @Column(name = "sex")
    private Integer sex;
    @Column(name = "last_login_time")
    private Date lastLoginTime;
}
