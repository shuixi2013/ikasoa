package com.ikasoa.core.thrift.server;

import java.util.concurrent.ExecutorService;

import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.server.TServerEventHandler;
import com.ikasoa.core.thrift.AbstractThriftConfiguration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Thrift服务器配置
 * 
 * @author <a href="mailto:larry7696@gmail.com">Larry</a>
 * @version 0.1
 */
@Getter
@NoArgsConstructor
@Setter
public class ThriftServerConfiguration extends AbstractThriftConfiguration {

	/**
	 * Thrift处理器工厂
	 */
	private TProcessorFactory processorFactory;

	/**
	 * Thrift服务器切面对象
	 */
	private ServerAspect serverAspect;

	/**
	 * Thrift服务事件处理器,用于扩展其它功能
	 */
	private TServerEventHandler serverEventHandler;

	/**
	 * Thrift服务使用的线程池(为空则默认)
	 * <p>
	 * 自定义线程池实现属于高级功能,一般情况下不推荐设置该值.
	 */
	private ExecutorService executorService;

	private ServerArgsAspect serverArgsAspect = new ServerArgsAspect();

	public ThriftServerConfiguration(TProcessorFactory processorFactory) {
		this.processorFactory = processorFactory;
	}

}
