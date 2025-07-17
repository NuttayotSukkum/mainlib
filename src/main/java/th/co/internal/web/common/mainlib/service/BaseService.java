package th.co.internal.web.common.mainlib.service;

import th.co.internal.web.common.mainlib.base.BaseRequest;
import th.co.internal.web.common.mainlib.base.BaseResponse;

public interface BaseService<T extends BaseRequest, V extends BaseResponse> {
    V execute(T var);
}
