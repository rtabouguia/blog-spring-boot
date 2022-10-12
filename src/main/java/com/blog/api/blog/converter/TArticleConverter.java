/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.converter;

import com.blog.api.blog.dto.TArticleDto;
import com.blog.api.blog.entity.TArticle;
import org.springframework.stereotype.Component;

/**
 *
 * @author RAISA
 */
@Component
public class TArticleConverter implements Converter<TArticle, TArticleDto> {

    @Override
    public TArticle toEntity(TArticleDto tArticleDto) {
        return tArticleDto.equals(null) ? null :
                TArticle.builder()
                              .id(tArticleDto.getId())
                              .title(tArticleDto.getTitle())
                              .description(tArticleDto.getDescription())
                              .save(tArticleDto.getSave())
  //                            .fk_category()
//                              .fk_user()
                              .build();
    }
    

    @Override
    public TArticleDto toDto(TArticle tArticle) {
       return  tArticle.equals(null) ? null :
                TArticleDto.builder()
                              .id(tArticle.getId())
                              .title(tArticle.getTitle())
                              .description(tArticle.getDescription())
                              .save(tArticle.getSave())
  //                            .fk_category()
//                              .fk_user()
                              .build();
    }
    
}
