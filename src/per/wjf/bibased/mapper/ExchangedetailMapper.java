package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.wjf.bibased.po.Exchangedetail;
import per.wjf.bibased.po.ExchangedetailExample;

public interface ExchangedetailMapper {
    int countByExample(ExchangedetailExample example);

    int deleteByExample(ExchangedetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Exchangedetail record);

    int insertSelective(Exchangedetail record);

    List<Exchangedetail> selectByExample(ExchangedetailExample example);

    Exchangedetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Exchangedetail record, @Param("example") ExchangedetailExample example);

    int updateByExample(@Param("record") Exchangedetail record, @Param("example") ExchangedetailExample example);

    int updateByPrimaryKeySelective(Exchangedetail record);

    int updateByPrimaryKey(Exchangedetail record);
}