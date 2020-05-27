package org.javaboy.vhr.mapper;


import org.apache.ibatis.annotations.*;
import org.javaboy.vhr.model.Production;


import java.util.List;
import java.util.Map;

public interface ProductionMapper {

    @Select("SELECT id, project ,money , time ,depa, people " +
            "FROM production ")
    List<Map> getAllList();

    @Select("SELECT money, time  " +
            "FROM production " +
            "ORDER BY time")
    List<Map> countRece();


    @Insert("INSERT INTO production (project,money,time,people,depa) VALUES (#{project},#{money},#{time},#{people},#{depa})")
    int insert(Production production);

    @Update("UPDATE production  " +
            "SET project=#{project},money=#{money},time=#{time},people=#{people},depa=#{depa} " +
            "WHERE id=#{id}")
    int update(Production production);

    @Delete("DELETE from production where id=#{id}")
    int delete(Integer id);




}
