package com.fxd.user.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author zhc
 * @Date 2021/3/2 19:44
 */
//@Configuration
//@MapperScan("com.fxd.user.dao")
public class MyBatisConfig {
//    @Autowired
    private DataSource dataSource;

//    @Bean
    public SqlSessionFactory sqlSessionFactory()throws Exception{
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        //实体类所在包
        sqlSessionFactory.setTypeAliasesPackage("com.fxd.user.entity");

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //实体类对应的操作SQL文件
        sqlSessionFactory.setMapperLocations(resolver.getResource("classpath*:**/mapper/*.xml"));
        return sqlSessionFactory.getObject();
    }
}
