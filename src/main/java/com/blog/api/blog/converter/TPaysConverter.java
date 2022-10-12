/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.converter;

import com.blog.api.blog.dto.TPaysDto;
import com.blog.api.blog.entity.TPays;

/**
 *
 * @author RAISA
 */
public class TPaysConverter implements Converter<TPays, TPaysDto>{

    @Override
    public TPays toEntity(TPaysDto tPaysDto) {
        return tPaysDto.equals(null) ? null :
                 TPays.builder()
                         .id(tPaysDto.getId())
                         .nom (tPaysDto.getNom())
                         .description(tPaysDto.getDescription())
                         .ajout(tPaysDto.getAjout())
  //                            .fk_user()
//                              .fk_article()
                              .build();
    }

    @Override
    public TPaysDto toDto(TPays tPays) {
          return tPays.equals(null) ? null :
                 TPaysDto.builder()
                         .id(tPays.getId())
                         .nom (tPays.getNom())
                         .description(tPays.getDescription())
                         .ajout(tPays.getAjout())
  //                            .fk_user()
//                              .fk_article()
                              .build();
    }

    
    
}
