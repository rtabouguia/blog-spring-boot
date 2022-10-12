/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.converter;

import com.blog.api.blog.dto.TCommentDto;
import com.blog.api.blog.entity.TComment;

/**
 *
 * @author RAISA
 */
public class TCommentConverter implements Converter<TComment, TCommentDto>{

    @Override
    public TComment toEntity(TCommentDto tCommentDto) {
        return tCommentDto.equals(null) ? null :
                 TComment.builder()
                              .commentaire(  tCommentDto.getCommentaire())
                              .publication(  tCommentDto.getPublication())
  //                            .fk_user()
//                              .fk_article()
                              .build();
    }

    @Override
    public TCommentDto toDto(TComment tComment) {
        return tComment.equals(null) ? null :
                 TCommentDto.builder()
                            .id(tComment.getId())
                              .commentaire(  tComment.getCommentaire())
                              .publication(  tComment.getPublication())
  //                            .fk_user()
//                              .fk_article()
                              .build();
    }
    
}
