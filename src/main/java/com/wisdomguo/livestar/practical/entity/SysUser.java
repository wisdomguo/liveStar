package com.wisdomguo.livestar.practical.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * sysUser
 *
 * @author wisdom-guo
 * @since 2021/5/21
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("sys_user")
public class SysUser implements Serializable {

    @TableId
    private Long id;

    private Long uid;

}
