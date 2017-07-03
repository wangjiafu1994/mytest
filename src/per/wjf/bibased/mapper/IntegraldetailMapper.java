package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.wjf.bibased.po.Integraldetail;
import per.wjf.bibased.po.IntegraldetailExample;

public interface IntegraldetailMapper {
    int countByExample(IntegraldetailExample example);

    int deleteByExample(IntegraldetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Integraldetail record);

    int insertSelective(Integraldetail record);

    List<Integraldetail> selectByExample(IntegraldetailExample example);

    Integraldetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Integraldetail record, @Param("example") IntegraldetailExample example);

    int updateByExample(@Param("record") Integraldetail record, @Param("example") IntegraldetailExample example);

    int updateByPrimaryKeySelective(Integraldetail record);

    int updateByPrimaryKey(Integraldetail record);
}