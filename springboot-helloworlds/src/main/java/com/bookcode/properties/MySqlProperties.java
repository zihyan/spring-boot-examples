package com.bookcode.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "mysql")
public class MySqlProperties {
    String jdbcName;
    String dbUrl;
    String userName;
    String password;
    public void setJdbcName(String args){
        this.jdbcName = args;
    }
    public void setDbUrl(String args){
        this.dbUrl = args;
    }
    public void setUserName(String args){
        this.userName = args;
    }
    public void setPassword(String args){
        this.password = args;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getJdbcName() {
        return jdbcName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "MySqlProperties{" +
                "jdbcName='" + jdbcName + '\'' +
                ", dbUrl='" + dbUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
