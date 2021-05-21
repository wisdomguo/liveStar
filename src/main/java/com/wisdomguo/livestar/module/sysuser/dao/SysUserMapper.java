package com.wisdomguo.livestar.module.sysuser.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wisdomguo.livestar.practical.entity.SysUser;

/**
 * SysUserMapper
 *
 * @author wisdom-guo
 * @since 2021/5/21
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser selectAll();
}
