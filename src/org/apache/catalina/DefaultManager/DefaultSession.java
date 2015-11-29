package org.apache.catalina.DefaultManager;

import java.io.Serializable;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Iterator;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import org.apache.catalina.Manager;
import org.apache.catalina.Session;
import org.apache.catalina.SessionListener;
/**
 * 
* @Description: 实现一个空的Session管理器，以达到禁用tomcat默认session机制的目的
* 优点：节省内存，提高性能，且方便用于集群部署。
* @author 猪肉有毒 waitfox@qq.com  
* @date 2015年11月29日 下午3:43:45 
* @version V1.0  
* 我只为你回眸一笑，即使不够倾国倾城，我只为你付出此生，换来生再次相守
 */
@SuppressWarnings("deprecation")
public class DefaultSession  implements HttpSession, Session, Serializable{

	@Override
	public void access() {
		
	}

	@Override
	public void addSessionListener(SessionListener arg0) {
		
	}

	@Override
	public void endAccess() {
		
		
	}

	@Override
	public void expire() {
		
		
	}

	@Override
	public String getAuthType() {
		return null;
	}

	@Override
	public long getCreationTimeInternal() {
		return 0;
	}

	@Override
	public String getIdInternal() {
		return null;
	}

	@Override
	public String getInfo() {
		return null;
	}

	@Override
	public long getLastAccessedTimeInternal() {
		return 0;
	}

	@Override
	public Manager getManager() {
		return null;
	}

	@Override
	public Object getNote(String arg0) {
		
		return null;
	}

	@Override
	public Iterator<String> getNoteNames() {
		
		return null;
	}

	@Override
	public Principal getPrincipal() {
		
		return null;
	}

	@Override
	public HttpSession getSession() {
		
		return null;
	}

	@Override
	public long getThisAccessedTime() {
		
		return 0;
	}

	@Override
	public long getThisAccessedTimeInternal() {
		
		return 0;
	}

	@Override
	public boolean isValid() {
		
		return false;
	}

	@Override
	public void recycle() {
		
		
	}

	@Override
	public void removeNote(String arg0) {
		
		
	}

	@Override
	public void removeSessionListener(SessionListener arg0) {
		
		
	}

	@Override
	public void setAuthType(String arg0) {
		
		
	}

	@Override
	public void setCreationTime(long arg0) {
		
		
	}

	@Override
	public void setId(String arg0) {
		
		
	}

	@Override
	public void setId(String arg0, boolean arg1) {
		
		
	}

	@Override
	public void setManager(Manager arg0) {
		
		
	}

	@Override
	public void setNew(boolean arg0) {
		
		
	}

	@Override
	public void setNote(String arg0, Object arg1) {
		
		
	}

	@Override
	public void setPrincipal(Principal arg0) {
		
		
	}

	@Override
	public void setValid(boolean arg0) {
		
		
	}

	@Override
	public Object getAttribute(String arg0) {
		
		return null;
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		
		return null;
	}

	@Override
	public long getCreationTime() {
		
		return 0;
	}

	@Override
	public String getId() {
		
		return null;
	}

	@Override
	public long getLastAccessedTime() {
		
		return 0;
	}

	@Override
	public int getMaxInactiveInterval() {
		
		return 0;
	}

	@Override
	public ServletContext getServletContext() {
		
		return null;
	}

	@Override
	public HttpSessionContext getSessionContext() {
		
		return null;
	}

	@Override
	public Object getValue(String arg0) {
		
		return null;
	}

	@Override
	public String[] getValueNames() {
		
		return null;
	}

	@Override
	public void invalidate() {
		
		
	}

	@Override
	public boolean isNew() {
		
		return false;
	}

	@Override
	public void putValue(String arg0, Object arg1) {
		
		
	}

	@Override
	public void removeAttribute(String arg0) {
			
	}

	@Override
	public void removeValue(String arg0) {		
		
	}

	@Override
	public void setAttribute(String arg0, Object arg1) {	
		
	}

	@Override
	public void setMaxInactiveInterval(int arg0) {
				
	}

}
