package personal.wayne.sequence.impl;

import personal.wayne.sequence.ISequenceService;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Wayne
 * @date 2018/7/25
 * @description 通过AtomicInteger获取sequence服务
 */
public class AtomicIntegerSequenceServiceImpl implements ISequenceService {
    private AtomicInteger sequence;
    private int length;

    public AtomicIntegerSequenceServiceImpl(int length) {
        this.sequence = new AtomicInteger(0);
        this.length = length;
    }

    public String getSequence() {
        /**
         * 获取当前sequence值，并自增
         */
        int seq = sequence.getAndIncrement() & Integer.MAX_VALUE;
        /**
         * 按照长度要求拼接生成固定长度sequence
         */
        String sequenceNo = Integer.toString(seq);
        StringBuilder sb = new StringBuilder();
        if (sequenceNo.length() > length) {
            sb.append(sequenceNo.substring(sequenceNo.length() - length));
        } else {
            for (int i = 0; i < length - sequenceNo.length(); i++) {
                sb.append("0");
            }
            sb.append(sequenceNo);
        }
        return sb.toString();
    }
}
