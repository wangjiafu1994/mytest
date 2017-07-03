package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.wjf.bibased.po.Proportion;
import per.wjf.bibased.po.ProportionExample;

public interface ProportionMapper {
    int countByExample(ProportionExample example);

    int deleteByExample(ProportionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Proportion record);

    int insertSelective(Proportion record);

    List<Proportion> selectByExample(ProportionExample example);

    Proportion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Proportion record, @Param("example") ProportionExample example);

    int updateByExample(@Param("record") Proportion record, @Param("example") ProportionExample example);

    int updateByPrimaryKeySelective(Proportion record);

    int updateByPrimaryKey(Proportion record);
}