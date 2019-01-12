package cn.com.connext.oms.mapper;

import cn.com.connext.oms.commons.dto.GoodsStockDto;
import cn.com.connext.oms.entity.TbGoods;
import tk.mybatis.mapper.MyMapper;
import java.util.List;

public interface TbGoodsMapper extends MyMapper<TbGoods> {
    /**
     * @Author: zhaojun
     * @Description: ������Ʒ��Ų�ѯ����Ʒ��ϸ��Ϣ
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/7 13:30
     */
    List<TbGoods> getGoodsImformation(int goodId);
    /**
     * @Author: zhaojun
     * @Description: ��ѯ������Ʒ
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/7 16:30
     */
    List<GoodsStockDto>getAllGoods();
    /**
     * @Author: zhaojun
     * @Description: ������Ʒid��ѯ��Ʒcode
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: ${DATE}
     */
    public int findIdByCode(String goodsCode);
}