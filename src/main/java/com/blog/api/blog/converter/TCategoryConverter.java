/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.converter;

import com.blog.api.blog.dto.TCategoryDto;
import com.blog.api.blog.entity.TCategory;

/**
 *
 * @author RAISA
 */
public class TCategoryConverter implements Converter<TCategory, TCategoryDto>{

    @Override
    public TCategory toEntity(TCategoryDto tCategoryDto) {
          return tCategoryDto.equals(null) ? null :
                TCategory.builder()
                              .id( tCategoryDto.getId())
                              .title( tCategoryDto.getTitle())
                              .description( tCategoryDto.getDescription())
                              .date_ajout( tCategoryDto.getDate_ajout())
  //                            .fk_category()
//                              .fk_user()
                              .build();
    }

    @Override
    public TCategoryDto toDto(TCategory tCategory) {
       return   tCategory.equals(null) ? null :
                TCategoryDto.builder()
                              .id( tCategory.getId())
                              .title( tCategory.getTitle())
                              .description( tCategory.getDescription())
                              .date_ajout( tCategory.getDate_ajout())
  //                            .fk_category()
//                              .fk_user()
                              .build();
    }
    
}
