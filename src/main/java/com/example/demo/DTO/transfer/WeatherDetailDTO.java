package com.example.demo.DTO.transfer;


import com.example.demo.DTO.transfer.WeatherPropertyDTO.ListDetail;

import java.util.ArrayList;
import java.util.List;

public class WeatherDetailDTO {
//    private Integer cod;
//    private String message;
//    private Integer cnt;
    private List<ListDetail> listWeather = new ArrayList<>();
//    private City city;
//
//
//    public City getCity() {
//        return city;
//    }
//
//    public void setCity(City city) {
//        this.city = city;
//    }
//
//    public Integer getCod() {
//        return cod;
//    }
//
//    public void setCod(Integer cod) {
//        this.cod = cod;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Integer getCnt() {
//        return cnt;
//    }
//
//    public void setCnt(Integer cnt) {
//        this.cnt = cnt;
//    }


    public List<ListDetail> getListWeather() {
        return listWeather;
    }

    public void setListWeather(List<ListDetail> listWeather) {
        this.listWeather = listWeather;
    }
}
