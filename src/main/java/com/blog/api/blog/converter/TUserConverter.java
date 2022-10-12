/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.converter;

import com.blog.api.blog.dto.TUserDto;
import com.blog.api.blog.entity.TUser;

/**
 *
 * @author RAISA
 */
public class TUserConverter implements Converter<TUser, TUserDto>{

    @Override
    public TUser toEntity(TUserDto tUserDto) {
        return tUserDto.equals(null) ? null :
                 TUser.builder()
                         .id(tUserDto.getId())
                         .username(tUserDto.getUsername())
                         .firstname (tUserDto.getFirstname())
                         .lastname(tUserDto.getLastname())
                         .inscription(tUserDto.getInscription())
                         .age(tUserDto.getAge())
//                              .fk_pays()
                              .build();
    }

    @Override
    public TUserDto toDto(TUser tUser) {
        return tUser.equals(null) ? null :
                 TUserDto.builder()
                         .id(tUser.getId())
                         .username(tUser.getUsername())
                         .firstname (tUser.getFirstname())
                         .lastname(tUser.getLastname())
                         .inscription(tUser.getInscription())
                         .age(tUser.getAge())
//                              .fk_pays()
                              .build();

    }
    
}
