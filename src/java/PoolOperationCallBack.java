import org.apache.thrift.TServiceClient;

 interface PoolOperationCallBack {
		// 销毁client之前执行
		void destroy(TServiceClient client);

		// 创建成功是执行
		void make(TServiceClient client);
	}