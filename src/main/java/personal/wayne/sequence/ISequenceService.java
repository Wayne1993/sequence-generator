package personal.wayne.sequence;

/**
 * @author Wayne
 * @date 2018/7/25
 * @description
 */
public interface ISequenceService {
    /**
     *
     * 功能描述: 
     *
     * @param: this method return a sequence that fix the param's rules.rule of smaller than max and no longer than lenth
     * @return: string sequence
     * @auther: Wayne
     * @date: 2018/7/25 17:27
     */
    public String getSequence();
}
