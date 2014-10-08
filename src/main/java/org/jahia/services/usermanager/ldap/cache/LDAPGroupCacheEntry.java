package org.jahia.services.usermanager.ldap.cache;

import org.jahia.modules.external.users.Member;
import org.jahia.services.usermanager.JahiaGroup;

import java.io.Serializable;
import java.util.List;

/**
 * @author kevan
 */
public class LDAPGroupCacheEntry extends LDAPAbstractCacheEntry implements Serializable{
    private static final long serialVersionUID = -3585067276227107907L;

    private JahiaGroup group;
    private List<Member> members;
    private boolean isDynamic = false;
    private String dynamicMembersURL;

    public LDAPGroupCacheEntry(String name) {
        setName(name);
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public JahiaGroup getGroup() {
        return group;
    }

    public void setGroup(JahiaGroup group) {
        this.group = group;
    }

    public boolean isDynamic() {
        return isDynamic;
    }

    public void setDynamic(boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    public String getDynamicMembersURL() {
        return dynamicMembersURL;
    }

    public void setDynamicMembersURL(String dynamicMembersURL) {
        this.dynamicMembersURL = dynamicMembersURL;
    }
}
