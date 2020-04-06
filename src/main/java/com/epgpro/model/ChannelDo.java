package com.epgpro.model;

import java.util.Date;

import lombok.Data;
/**
 * 
 * @author jagol
 * @date 2020年4月3日上午11:15:05
 * 描述：channel实体类
 */
@Data
public class ChannelDo {
   
    private Integer id;

   
    private String name;

  
    private String callsign;

  
    private String webtype;

 
    private String contentid;

   
    private Date createtime;

  
    private String description;

  
    private String language;

   
    private Integer status;

    
    private String satellite;

   
    private String showno;

 
    private String imgurl;

  
    private String property;

    
}