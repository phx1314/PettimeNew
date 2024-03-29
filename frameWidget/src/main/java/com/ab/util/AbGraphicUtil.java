/*
 * Copyright (C) 2012 www.amsoft.cn
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ab.util;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.text.Layout;
import android.text.TextPaint;

import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc

/**
 * © 2012 amsoft.cn
 * 名称：AbGraphic.java 
 * 描述：图形处理类.
 *
 * @author 还如一梦中
 * @version v1.0
 * @date：2013-01-17 下午11:52:13
 */
public final class AbGraphicUtil {
    
     /**
      * 描述：获取字符的所在位置（按像素获取最大能容纳的）.
      *
      * @param str 指定的字符串
      * @param maxPix 要取到的位置（像素）
      * @param paint the paint
      * @return 字符的所在位置
      */
     public static int subStringLength(String str,int maxPix,TextPaint paint) {
    	 if(AbStrUtil.isEmpty(str)){
    		 return 0;
    	 }
    	 int currentIndex = 0;
         for (int i = 0; i < str.length(); i++) {
             //获取一个字符 
             String temp = str.substring(0, i + 1);
             float valueLength  = paint.measureText(temp);
             if(valueLength > maxPix){
            	 currentIndex = i-1;
            	 break;
             }else if(valueLength == maxPix){
            	 currentIndex = i;
            	 break;
             }
         }
         //短于最大像素返回最后一个字符位置
         if(currentIndex==0){
        	 currentIndex = str.length()-1 ;
         }
         return currentIndex;
     }
     
     /**
      * 描述：获取文字的像素宽.
      *
      * @param str the str
      * @param paint the paint
      * @return the string width
      */
     public static float getStringWidth(String str,TextPaint paint) {
    	 float strWidth  = paint.measureText(str);
         return strWidth;
     }
     
     /**
      * 获得文字的宽度
      * @param str the str
      * @param paint the paint
      * @return the string width
      */
     public static float getDesiredWidth(String str,TextPaint paint) {
    	 float strWidth = Layout.getDesiredWidth(str, paint);
         return strWidth;
     }
     
     /**
      * 获取文字的高度
      * @param paint the textPaint
      * @return the string height
      */
     public static float getDesiredHeight(TextPaint paint) {
    	 FontMetrics  fm  = paint.getFontMetrics();
         return (float)Math.ceil(fm.descent - fm.ascent);
     }

     /**
      * 解析成行.
      * @param text the text
      * @param maxWPix the max w pix
      * @param paint the paint
      * @return the draw row count
      */
     public static List<String> getDrawRowStr(String text,int maxWPix,TextPaint paint) {
     	String [] texts = null;
     	if(text.indexOf("\n")!=-1){
     		 texts = text.split("\n");
     	}else{
     		 texts  = new String [1];
     		 texts[0] = text;
     	}
     	//共多少行
     	List<String> mStrList  = new ArrayList<String>();
     	
     	for(int i=0;i<texts.length;i++){
   		    String textLine = texts[i];
   		    //计算这个文本显示为几行
            while(true){
	           	 //可容纳的最后一个字的位置
	           	 int endIndex = subStringLength(textLine,maxWPix,paint);
	           	 if(endIndex<=0){
	           		mStrList.add(textLine);
	           	 }else{
	           		if(endIndex == textLine.length()-1){
	           			mStrList.add(textLine);
	           		}else{
	           			mStrList.add(textLine.substring(0,endIndex+1));
	           		}
	           		 
	           	 }
	           	 //获取剩下的
	           	 if(textLine.length()>endIndex+1){
	           		 //还有剩下的
	           		 textLine = textLine.substring(endIndex+1);
	           	 }else{
	           		 break;
	           	 }
            }
   	     }
        
         return mStrList;
     }
     
     /**
      * 
      * 描述：获取这段文本多少行.
      * @param text
      * @param textSize
      * @param maxWPix
      * @return
      */
     public static int getDrawRowCount(String text,int maxWPix,TextPaint paint) {
    	
    	String [] texts = null;
     	if(text.indexOf("\n")!=-1){
     		 texts = text.split("\n");
     	}else{
     		 texts  = new String [1];
     		 texts[0] = text;
     	}
     	//共多少行
     	List<String> mStrList  = new ArrayList<String>();
     	
     	for(int i=0;i<texts.length;i++){
   		    String textLine = texts[i];
   		    //计算这个文本显示为几行
            while(true){
	           	 //可容纳的最后一个字的位置
	           	 int endIndex = subStringLength(textLine,maxWPix,paint);
	           	 if(endIndex<=0){
	           		mStrList.add(textLine);
	           	 }else{
	           		if(endIndex == textLine.length()-1){
	           			mStrList.add(textLine);
	           		}else{
	           			mStrList.add(textLine.substring(0,endIndex+1));
	           		}
	           		 
	           	 }
	           	 //获取剩下的
	           	 if(textLine.length()>endIndex+1){
	           		 //还有剩下的
	           		 textLine = textLine.substring(endIndex+1);
	           	 }else{
	           		 break;
	           	 }
            }
   	     }
        
         return mStrList.size();
     }
     
     /**
      * 描述：绘制文本，支持换行.
      *
      * @param canvas the canvas
      * @param text the text
      * @param maxWPix the max w pix
      * @param paint the paint
      * @param left the left
      * @param top the top
      * @return the int
      */
     public static int drawText(Canvas canvas,String text,int maxWPix,TextPaint paint,int left,int top) {
    	if(AbStrUtil.isEmpty(text)){
    		return 1;
    	}
    	//需要根据文字长度控制换行
        //测量文字的长度
    	List<String> mStrList  = getDrawRowStr(text,maxWPix,paint);
         
        int hSize = (int)getDesiredHeight(paint);
         
        for(int i=0;i<mStrList.size();i++){
        	 //计算坐标
        	 int x = left;
             int y = top+hSize/2+hSize*i;
    		 String textLine = mStrList.get(i);
             canvas.drawText(textLine,x,y, paint); 
             
        }
        return mStrList.size();
     }
     

}
