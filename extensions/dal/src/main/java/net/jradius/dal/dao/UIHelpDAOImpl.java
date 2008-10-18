package net.jradius.dal.dao;

import com.coova.dal.SqlMapClientWrapper;
import java.util.List;
import net.jradius.dal.model.UIHelp;
import net.jradius.dal.model.UIHelpExample;

public class UIHelpDAOImpl extends SqlMapClientWrapper implements UIHelpDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public UIHelpDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Long insert(UIHelp record) {
        Object newKey = insert("uihelp", "abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByPrimaryKey(UIHelp record) {
        int rows = update("uihelp", "abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByPrimaryKeySelective(UIHelp record) {
        int rows = update("uihelp", "abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    @SuppressWarnings("unchecked")
    public List<UIHelp> selectByExample(UIHelpExample example) {
        List<UIHelp> list = (List<UIHelp>) queryForList("uihelp", "abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public UIHelp selectByPrimaryKey(Long id) {
        UIHelp key = new UIHelp();
        key.setId(id);
        UIHelp record = (UIHelp) queryForObject("uihelp", "abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int deleteByExample(UIHelpExample example) {
        int rows = delete("uihelp", "abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int deleteByPrimaryKey(Long id) {
        UIHelp key = new UIHelp();
        key.setId(id);
        int rows = delete("uihelp", "abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int countByExample(UIHelpExample example) {
        Integer count = (Integer)  queryForObject("uihelp", "abatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByExampleSelective(UIHelp record, UIHelpExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = update("uihelp", "abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByExample(UIHelp record, UIHelpExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = update("uihelp", "abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private static class UpdateByExampleParms extends UIHelpExample {
        private Object record;

        public UpdateByExampleParms(Object record, UIHelpExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}