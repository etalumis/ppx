// automatically generated by the FlatBuffers compiler, do not modify

import { Bernoulli } from '../ppx/bernoulli';
import { Beta } from '../ppx/beta';
import { Binomial } from '../ppx/binomial';
import { Categorical } from '../ppx/categorical';
import { Exponential } from '../ppx/exponential';
import { Gamma } from '../ppx/gamma';
import { LogNormal } from '../ppx/log-normal';
import { Normal } from '../ppx/normal';
import { Poisson } from '../ppx/poisson';
import { Uniform } from '../ppx/uniform';
import { Weibull } from '../ppx/weibull';


export enum Distribution{
  NONE = 0,
  Normal = 1,
  Uniform = 2,
  Categorical = 3,
  Poisson = 4,
  Bernoulli = 5,
  Beta = 6,
  Exponential = 7,
  Gamma = 8,
  LogNormal = 9,
  Binomial = 10,
  Weibull = 11
}

export function unionToDistribution(
  type: Distribution,
  accessor: (obj:Bernoulli|Beta|Binomial|Categorical|Exponential|Gamma|LogNormal|Normal|Poisson|Uniform|Weibull) => Bernoulli|Beta|Binomial|Categorical|Exponential|Gamma|LogNormal|Normal|Poisson|Uniform|Weibull|null
): Bernoulli|Beta|Binomial|Categorical|Exponential|Gamma|LogNormal|Normal|Poisson|Uniform|Weibull|null {
  switch(Distribution[type]) {
    case 'NONE': return null; 
    case 'Normal': return accessor(new Normal())! as Normal;
    case 'Uniform': return accessor(new Uniform())! as Uniform;
    case 'Categorical': return accessor(new Categorical())! as Categorical;
    case 'Poisson': return accessor(new Poisson())! as Poisson;
    case 'Bernoulli': return accessor(new Bernoulli())! as Bernoulli;
    case 'Beta': return accessor(new Beta())! as Beta;
    case 'Exponential': return accessor(new Exponential())! as Exponential;
    case 'Gamma': return accessor(new Gamma())! as Gamma;
    case 'LogNormal': return accessor(new LogNormal())! as LogNormal;
    case 'Binomial': return accessor(new Binomial())! as Binomial;
    case 'Weibull': return accessor(new Weibull())! as Weibull;
    default: return null;
  }
}

export function unionListToDistribution(
  type: Distribution, 
  accessor: (index: number, obj:Bernoulli|Beta|Binomial|Categorical|Exponential|Gamma|LogNormal|Normal|Poisson|Uniform|Weibull) => Bernoulli|Beta|Binomial|Categorical|Exponential|Gamma|LogNormal|Normal|Poisson|Uniform|Weibull|null, 
  index: number
): Bernoulli|Beta|Binomial|Categorical|Exponential|Gamma|LogNormal|Normal|Poisson|Uniform|Weibull|null {
  switch(Distribution[type]) {
    case 'NONE': return null; 
    case 'Normal': return accessor(index, new Normal())! as Normal;
    case 'Uniform': return accessor(index, new Uniform())! as Uniform;
    case 'Categorical': return accessor(index, new Categorical())! as Categorical;
    case 'Poisson': return accessor(index, new Poisson())! as Poisson;
    case 'Bernoulli': return accessor(index, new Bernoulli())! as Bernoulli;
    case 'Beta': return accessor(index, new Beta())! as Beta;
    case 'Exponential': return accessor(index, new Exponential())! as Exponential;
    case 'Gamma': return accessor(index, new Gamma())! as Gamma;
    case 'LogNormal': return accessor(index, new LogNormal())! as LogNormal;
    case 'Binomial': return accessor(index, new Binomial())! as Binomial;
    case 'Weibull': return accessor(index, new Weibull())! as Weibull;
    default: return null;
  }
}

