/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.converter;

/**
 *
 * @author RAISA
 * permet de convertir les entités en dto et les dto en entités
 */
public interface Converter<ENTITY, DTO> {
    
    ENTITY toEntity(DTO dto);
    
    DTO toDto(ENTITY entity);
}
