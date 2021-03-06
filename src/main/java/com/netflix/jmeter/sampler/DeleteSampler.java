package com.netflix.jmeter.sampler;

public class DeleteSampler extends AbstractSampler
{
    private static final long serialVersionUID = -2103499609822848595L;

    public ResponseData execute() throws OperationException
    {
        Operation ops = Connection.getInstance().newOperation(getColumnFamily(), false);
        setSerializers(ops);
        return ops.delete(getKey(), getColumnName());
    }
}
